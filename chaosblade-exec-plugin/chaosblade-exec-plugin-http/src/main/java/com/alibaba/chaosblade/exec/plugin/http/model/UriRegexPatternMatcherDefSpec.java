package com.alibaba.chaosblade.exec.plugin.http.model;

import com.alibaba.chaosblade.exec.common.model.matcher.BasePredicateMatcherSpec;

public class UriRegexPatternMatcherDefSpec extends BasePredicateMatcherSpec {

    @Override
    public String getName() {
        return HttpConstant.URI_REGEX_PATTERN_KEY;
    }

    @Override
    public String getDesc() {
        return "regex match url";
    }

    @Override
    public boolean noArgs() {
        return false;
    }

    @Override
    public boolean required() {
        return false;
    }
}
