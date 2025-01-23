package com.example.config;

import com.yomahub.liteflow.parser.el.ClassJsonFlowELParser;

public class LiteFlowElParser extends ClassJsonFlowELParser {

    @Override
    public String parseCustom() {
        System.out.println("执行了自定义parser");
        String xmlContent = "{\n" +
                "  \"flow\": {\n" +
                "    \"chain\": [\n" +
                "      {\n" +
                "        \"name\": \"chain1\",\n" +
                "        \"value\": \"THEN(a, b, WHEN(c, d))\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}\n";
        //这里需要自己扩展从自定义的地方获取配置
        return xmlContent;
    }
}
