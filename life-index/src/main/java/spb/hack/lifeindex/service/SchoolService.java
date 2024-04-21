package spb.hack.lifeindex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spb.hack.lifeindex.client.impl.SchoolClient;
import spb.hack.lifeindex.model.dto.RequestParamsDto;
import spb.hack.lifeindex.model.dto.impl.SchoolDto;

import java.util.concurrent.Callable;

@Service
@RequiredArgsConstructor
@Async
public class SchoolService {

    private final SchoolClient schoolClient;

    public Callable<ResponseDataDto> getAllData(RequestParamsDto requestParamsDto) {
        SchoolDto schoolDto = schoolClient.getDto(requestParamsDto);
        ResponseDataDto responseDataDto = new ResponseDataDto();
        responseDataDto.setCount(schoolDto.getCount());
        responseDataDto.setGeoData(schoolDto.getResults());
        return () -> responseDataDto;
    }
}
