package com.in28minutes.microservices.limitsservice.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class LimitsConfiguration {
    @Getter
    @Setter
    private int max;
    @Getter
    @Setter
    private int min;

    public LimitsConfiguration() {}
}
