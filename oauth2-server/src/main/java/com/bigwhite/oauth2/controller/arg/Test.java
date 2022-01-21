package com.bigwhite.oauth2.controller.arg;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Test {

    @Schema(description = "test's name",name = "name",example = "bigwhite")
    String name;

}
