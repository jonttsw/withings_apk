package com.withings.target;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
/* compiled from: TargetSerializer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/withings/target/TargetSerializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/withings/target/Target;", "()V", "serialize", "Lcom/google/gson/JsonElement;", "src", "typeOfSrc", "Ljava/lang/reflect/Type;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/google/gson/JsonSerializationContext;", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TargetSerializer implements JsonSerializer<Target> {
    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Target src, Type typeOfSrc, JsonSerializationContext context) {
        u.j(src, "src");
        u.j(typeOfSrc, "typeOfSrc");
        u.j(context, "context");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("target_type", Integer.valueOf(src.getType()));
        jsonObject.addProperty("target_id", Integer.valueOf(src.getMeasureType()));
        jsonObject.addProperty("mantissa", Integer.valueOf(src.getMantissa()));
        jsonObject.addProperty("exponent", Integer.valueOf(src.getExponent()));
        jsonObject.addProperty("date", Long.valueOf(src.getCreated().getMillis() / 1000));
        if (src.getAttrib() != null) {
            jsonObject.addProperty("attrib", src.getAttrib());
        }
        if (src.getRange() > 0) {
            jsonObject.addProperty(ValidateElement.RangeValidateElement.METHOD, Integer.valueOf(src.getRange()));
        }
        return jsonObject;
    }
}
