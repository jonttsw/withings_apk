package com.withings.webservices.legacy.common;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import java.lang.reflect.Type;
import retrofit.converter.ConversionException;
import retrofit.converter.GsonConverter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
/* loaded from: classes4.dex */
public class WsConverter extends GsonConverter {
    private Gson gson;

    /* loaded from: classes4.dex */
    private static class BaseObject {
        public JsonElement body;
        public String error;
        public int status;

        private BaseObject() {
        }
    }

    @Deprecated
    public WsConverter() {
        this(Webservices.get().getGson());
    }

    @Deprecated
    public static Gson getGson() {
        return Webservices.get().getGson();
    }

    @Deprecated
    public static void registerTypeAdapter(Type type, JsonDeserializer jsonDeserializer) {
        Webservices.get().registerTypeAdapter(type, jsonDeserializer);
    }

    @Override // retrofit.converter.GsonConverter, retrofit.converter.Converter
    public Object fromBody(TypedInput typedInput, Type type) throws ConversionException {
        BaseObject baseObject = (BaseObject) super.fromBody(typedInput, BaseObject.class);
        if (baseObject.status == 0) {
            return this.gson.fromJson(baseObject.body, type);
        }
        throw new WrongStatusException.Conversion(baseObject.status, baseObject.error, baseObject.body);
    }

    @Override // retrofit.converter.GsonConverter, retrofit.converter.Converter
    public TypedOutput toBody(Object obj) {
        return super.toBody(obj);
    }

    public WsConverter(Gson gson) {
        super(gson);
        this.gson = gson;
    }
}
