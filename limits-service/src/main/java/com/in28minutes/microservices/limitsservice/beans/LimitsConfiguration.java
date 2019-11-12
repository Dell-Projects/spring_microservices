package com.in28minutes.microservices.limitsservice.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class LimitsConfiguration {
    private int max;
    private int min;

    public LimitsConfiguration() {}

    public LimitsConfiguration(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
