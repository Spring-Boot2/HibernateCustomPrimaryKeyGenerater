package com.go.testboot;

import java.io.Serializable;

public interface Identifiable<T extends Serializable> {
    String getUserID();
}