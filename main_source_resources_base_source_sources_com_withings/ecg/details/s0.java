package com.withings.ecg.details;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteRepository;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, LiveData<NoteGroup>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f38306a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(b0 b0Var) {
        super(1);
        this.f38306a = b0Var;
    }

    @Override // ym0.l
    public final LiveData<NoteGroup> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        NoteRepository noteRepository;
        NoteRepository noteRepository2;
        HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
        Long signalId = heartSignalMeasurement2.getSignal().getSignalId();
        b0 b0Var = this.f38306a;
        if (signalId != null) {
            long longValue = signalId.longValue();
            noteRepository2 = b0Var.f38099c;
            LiveData<NoteGroup> remoteNoteGroupLiveDataForId = noteRepository2.getRemoteNoteGroupLiveDataForId(longValue);
            if (remoteNoteGroupLiveDataForId != null) {
                return remoteNoteGroupLiveDataForId;
            }
        }
        noteRepository = b0Var.f38099c;
        return noteRepository.getLocalNoteGroupLiveDataForId(heartSignalMeasurement2.getId());
    }
}
