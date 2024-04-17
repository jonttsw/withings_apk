package com.withings.clinicalstudy.repository;

import com.google.gson.Gson;
import com.withings.learnmore.adapter.LearnMoreManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import nm0.k;
import nm0.l;
import qm0.d;
/* compiled from: JsonClinicalStudySuggestionRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withings/clinicalstudy/repository/JsonClinicalStudySuggestionRepository;", "Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestionRepository;", "", "measureType", "modelId", "", "", "getFromJson", "(ILjava/lang/Integer;)Ljava/util/List;", "getFor", "(ILjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", LearnMoreManager.KEY_LEARN_MORE_JSON, "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "setJson", "(Ljava/lang/String;)V", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class JsonClinicalStudySuggestionRepository implements ClinicalStudySuggestionRepository {
    private final Gson gson = new Gson();
    private String json;

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> getFromJson(int r5, java.lang.Integer r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.json
            r1 = 0
            if (r0 == 0) goto L17
            com.google.gson.Gson r2 = r4.gson
            com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository$getFromJson$suggestions$1$1 r3 = new com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository$getFromJson$suggestions$1$1
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            java.lang.Object r0 = r2.fromJson(r0, r3)
            java.util.List r0 = (java.util.List) r0
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L38
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.withings.clinicalstudy.repository.ClinicalStudySuggestion r3 = (com.withings.clinicalstudy.repository.ClinicalStudySuggestion) r3
            int r3 = r3.getMeasureType()
            if (r3 != r5) goto L20
            goto L35
        L34:
            r2 = r1
        L35:
            com.withings.clinicalstudy.repository.ClinicalStudySuggestion r2 = (com.withings.clinicalstudy.repository.ClinicalStudySuggestion) r2
            goto L39
        L38:
            r2 = r1
        L39:
            if (r6 == 0) goto L6e
            int r5 = r6.intValue()
            if (r2 == 0) goto L6b
            java.util.List r6 = r2.getByModels()
            if (r6 == 0) goto L6b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r6.next()
            r3 = r0
            com.withings.clinicalstudy.repository.ClinicalStudySuggestion$ByModel r3 = (com.withings.clinicalstudy.repository.ClinicalStudySuggestion.ByModel) r3
            int r3 = r3.getModelId()
            if (r3 != r5) goto L4d
            goto L62
        L61:
            r0 = r1
        L62:
            com.withings.clinicalstudy.repository.ClinicalStudySuggestion$ByModel r0 = (com.withings.clinicalstudy.repository.ClinicalStudySuggestion.ByModel) r0
            if (r0 == 0) goto L6b
            java.util.List r5 = r0.getSuggestions()
            goto L6c
        L6b:
            r5 = r1
        L6c:
            if (r5 != 0) goto L7a
        L6e:
            if (r2 == 0) goto L74
            java.util.List r1 = r2.getSuggestions()
        L74:
            if (r1 != 0) goto L79
            kotlin.collections.i0 r5 = kotlin.collections.i0.f76187a
            goto L7a
        L79:
            r5 = r1
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.clinicalstudy.repository.JsonClinicalStudySuggestionRepository.getFromJson(int, java.lang.Integer):java.util.List");
    }

    @Override // com.withings.clinicalstudy.repository.ClinicalStudySuggestionRepository
    public Object getFor(int i11, Integer num, d<? super List<String>> dVar) {
        Object a11;
        try {
            a11 = getFromJson(i11, num);
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        i0 i0Var = i0.f76187a;
        if (a11 instanceof k.a) {
            return i0Var;
        }
        return a11;
    }

    public final String getJson() {
        return this.json;
    }

    public final void setJson(String str) {
        this.json = str;
    }
}
