package com.annotation.excercise.repeatableannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}
