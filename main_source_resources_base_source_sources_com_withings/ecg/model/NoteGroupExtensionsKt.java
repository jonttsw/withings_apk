package com.withings.ecg.model;

import com.withings.note.model.NoteGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NoteGroupExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"getEcg", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "Lcom/withings/note/model/NoteGroup;", "heartSignalRepository", "Lcom/withings/ecg/model/HeartSignalRepository;", "ecg_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoteGroupExtensionsKt {
    public static final HeartSignalMeasurement getEcg(NoteGroup noteGroup, HeartSignalRepository heartSignalRepository) {
        HeartSignalMeasurement notDeletedBySignalId;
        u.j(noteGroup, "<this>");
        u.j(heartSignalRepository, "heartSignalRepository");
        Long signalId = noteGroup.getSignalId();
        if (signalId == null || (notDeletedBySignalId = heartSignalRepository.getNotDeletedBySignalId(signalId.longValue())) == null) {
            Long localHeartSignalMeasurementId = noteGroup.getLocalHeartSignalMeasurementId();
            if (localHeartSignalMeasurementId != null) {
                return heartSignalRepository.getNotDeletedHeartSignal(localHeartSignalMeasurementId.longValue());
            }
            return null;
        }
        return notDeletedBySignalId;
    }
}
