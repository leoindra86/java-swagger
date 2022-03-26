package com.swaggerph1.swaggerph1.space;


import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@Api(value = "My Space craft controller - here we create and list out spacecrafts" )
public class SpacecraftController {

    private List<SpaceCraft> crafts = new ArrayList();

    @GetMapping("/spacecraft")
    @ApiOperation(value = "this lists our current spacecrafts", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 504, message = "System is overloaded... Wait"),
            @ApiResponse(code = 505, message = "We are out of spacecraft material"),
            @ApiResponse(code = 506, message = "On Holidays")
    })
    public List<SpaceCraft> crafts() {
        return crafts;
    }

    //Works without @ApiParam, as it adds a asthetic to fields
    @PostMapping("/spacecraft")
    @ApiOperation(value = "Create a new brand new spacecraft", response = SpaceCraft.class)
    public SpaceCraft createcraft(
            @ApiParam(value = "Give our craft  a cool name", required = true) @RequestParam String craftName,
            @ApiParam(value = "Number of members", required = false) @RequestParam Integer crew,
            @ApiParam(value = "Total Weight", required = true) @RequestParam Integer weight,
            @ApiParam(value = "Description", required = true) @RequestParam String description){

        SpaceCraft newcraft = SpaceCraft.builder().description(description)
                .weight(weight)
                .numberOfCrew(crew)
                .name(craftName).build();
        crafts.add(newcraft);
        return newcraft;

    }

}
