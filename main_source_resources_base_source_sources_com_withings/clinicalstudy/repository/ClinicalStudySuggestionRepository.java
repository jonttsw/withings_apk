package com.withings.clinicalstudy.repository;

import java.util.List;
import kotlin.Metadata;
import qm0.d;
/* compiled from: ClinicalStudySuggestionRepository.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withings/clinicalstudy/repository/ClinicalStudySuggestionRepository;", "", "", "measureType", "modelId", "", "", "getFor", "(ILjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface ClinicalStudySuggestionRepository {

    /* compiled from: ClinicalStudySuggestionRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getFor$default(ClinicalStudySuggestionRepository clinicalStudySuggestionRepository, int i11, Integer num, d dVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                num = null;
            }
            return clinicalStudySuggestionRepository.getFor(i11, num, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFor");
    }

    Object getFor(int i11, Integer num, d<? super List<String>> dVar);
}
