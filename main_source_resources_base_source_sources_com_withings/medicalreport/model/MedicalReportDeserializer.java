package com.withings.medicalreport.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.medicalreport.model.MedicalReport;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: MedicalReportDeserializer.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0016"}, d2 = {"Lcom/withings/medicalreport/model/MedicalReportDeserializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/withings/medicalreport/model/MedicalReport;", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", LearnMoreManager.KEY_LEARN_MORE_JSON, "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/google/gson/JsonDeserializationContext;", "deserializeMedialReport", "jsonObject", "Lcom/google/gson/JsonObject;", "getMedicalReportDelayed", "getMedicalReportPDF", "serialize", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "serializeMedicalReport", "medicalreport_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MedicalReportDeserializer implements JsonSerializer<MedicalReport>, JsonDeserializer<MedicalReport> {
    public static final int $stable = 0;

    private final MedicalReport deserializeMedialReport(JsonObject jsonObject) {
        if (jsonObject.get("medicalreport") != null) {
            return getMedicalReportPDF(jsonObject);
        }
        return getMedicalReportDelayed(jsonObject);
    }

    private final MedicalReport getMedicalReportDelayed(JsonObject jsonObject) {
        return new MedicalReport.PdfDelayed(jsonObject.get("wait_seconds").getAsInt());
    }

    private final MedicalReport getMedicalReportPDF(JsonObject jsonObject) {
        String asString = jsonObject.getAsJsonObject("medicalreport").get("data").getAsString();
        u.i(asString, "getAsString(...)");
        return new MedicalReport.Pdf(new CompressedPdf(asString));
    }

    private final JsonElement serializeMedicalReport(MedicalReport medicalReport) {
        JsonObject jsonObject = new JsonObject();
        if (medicalReport instanceof MedicalReport.Pdf) {
            jsonObject.addProperty("medicalreport", ((MedicalReport.Pdf) medicalReport).getCompressedPdf().getPdfData());
        } else {
            u.h(medicalReport, "null cannot be cast to non-null type com.withings.medicalreport.model.MedicalReport.PdfDelayed");
            jsonObject.addProperty("wait_seconds", Integer.valueOf(((MedicalReport.PdfDelayed) medicalReport).getWaitSeconds()));
        }
        return jsonObject;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public MedicalReport deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) {
        u.j(json, "json");
        JsonObject asJsonObject = json.getAsJsonObject();
        u.i(asJsonObject, "getAsJsonObject(...)");
        return deserializeMedialReport(asJsonObject);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(MedicalReport medicalReport, Type type, JsonSerializationContext jsonSerializationContext) {
        return serializeMedicalReport(medicalReport);
    }
}
