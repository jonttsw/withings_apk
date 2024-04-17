package com.withings.clinicalstudy.repository;

import com.withings.insight.android.entity.UserResponseTypeHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonClinicalStudySuggestionRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestion;", "", "measureType", "", UserResponseTypeHandler.TYPE_SUGGESTION, "", "", "byModels", "Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestion$ByModel;", "(ILjava/util/List;Ljava/util/List;)V", "getByModels", "()Ljava/util/List;", "getMeasureType", "()I", "getSuggestions", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ByModel", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClinicalStudySuggestion {
    private final List<ByModel> byModels;
    private final int measureType;
    private final List<String> suggestions;

    /* compiled from: JsonClinicalStudySuggestionRepository.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestion$ByModel;", "", "modelId", "", UserResponseTypeHandler.TYPE_SUGGESTION, "", "", "(ILjava/util/List;)V", "getModelId", "()I", "getSuggestions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ByModel {
        private final int modelId;
        private final List<String> suggestions;

        public ByModel(int i11, List<String> suggestions) {
            u.j(suggestions, "suggestions");
            this.modelId = i11;
            this.suggestions = suggestions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ByModel copy$default(ByModel byModel, int i11, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = byModel.modelId;
            }
            if ((i12 & 2) != 0) {
                list = byModel.suggestions;
            }
            return byModel.copy(i11, list);
        }

        public final int component1() {
            return this.modelId;
        }

        public final List<String> component2() {
            return this.suggestions;
        }

        public final ByModel copy(int i11, List<String> suggestions) {
            u.j(suggestions, "suggestions");
            return new ByModel(i11, suggestions);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ByModel)) {
                return false;
            }
            ByModel byModel = (ByModel) obj;
            if (this.modelId == byModel.modelId && u.e(this.suggestions, byModel.suggestions)) {
                return true;
            }
            return false;
        }

        public final int getModelId() {
            return this.modelId;
        }

        public final List<String> getSuggestions() {
            return this.suggestions;
        }

        public int hashCode() {
            return this.suggestions.hashCode() + (Integer.hashCode(this.modelId) * 31);
        }

        public String toString() {
            int i11 = this.modelId;
            List<String> list = this.suggestions;
            return "ByModel(modelId=" + i11 + ", suggestions=" + list + ")";
        }
    }

    public ClinicalStudySuggestion(int i11, List<String> suggestions, List<ByModel> byModels) {
        u.j(suggestions, "suggestions");
        u.j(byModels, "byModels");
        this.measureType = i11;
        this.suggestions = suggestions;
        this.byModels = byModels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClinicalStudySuggestion copy$default(ClinicalStudySuggestion clinicalStudySuggestion, int i11, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = clinicalStudySuggestion.measureType;
        }
        if ((i12 & 2) != 0) {
            list = clinicalStudySuggestion.suggestions;
        }
        if ((i12 & 4) != 0) {
            list2 = clinicalStudySuggestion.byModels;
        }
        return clinicalStudySuggestion.copy(i11, list, list2);
    }

    public final int component1() {
        return this.measureType;
    }

    public final List<String> component2() {
        return this.suggestions;
    }

    public final List<ByModel> component3() {
        return this.byModels;
    }

    public final ClinicalStudySuggestion copy(int i11, List<String> suggestions, List<ByModel> byModels) {
        u.j(suggestions, "suggestions");
        u.j(byModels, "byModels");
        return new ClinicalStudySuggestion(i11, suggestions, byModels);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClinicalStudySuggestion)) {
            return false;
        }
        ClinicalStudySuggestion clinicalStudySuggestion = (ClinicalStudySuggestion) obj;
        if (this.measureType == clinicalStudySuggestion.measureType && u.e(this.suggestions, clinicalStudySuggestion.suggestions) && u.e(this.byModels, clinicalStudySuggestion.byModels)) {
            return true;
        }
        return false;
    }

    public final List<ByModel> getByModels() {
        return this.byModels;
    }

    public final int getMeasureType() {
        return this.measureType;
    }

    public final List<String> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        return this.byModels.hashCode() + e.b(this.suggestions, Integer.hashCode(this.measureType) * 31, 31);
    }

    public String toString() {
        int i11 = this.measureType;
        List<String> list = this.suggestions;
        List<ByModel> list2 = this.byModels;
        StringBuilder sb2 = new StringBuilder("ClinicalStudySuggestion(measureType=");
        sb2.append(i11);
        sb2.append(", suggestions=");
        sb2.append(list);
        sb2.append(", byModels=");
        return d.i(sb2, list2, ")");
    }
}
