package com.withings.ecg.heartsound;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteRepository;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, LiveData<NoteGroup>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NoteRepository f38565a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(NoteRepository noteRepository) {
        super(1);
        this.f38565a = noteRepository;
    }

    @Override // ym0.l
    public final LiveData<NoteGroup> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        LiveData<NoteGroup> remoteNoteGroupLiveDataForId;
        HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
        Long signalId = heartSignalMeasurement2.getSignal().getSignalId();
        NoteRepository noteRepository = this.f38565a;
        if (signalId == null || (remoteNoteGroupLiveDataForId = noteRepository.getRemoteNoteGroupLiveDataForId(signalId.longValue())) == null) {
            return noteRepository.getLocalNoteGroupLiveDataForId(heartSignalMeasurement2.getId());
        }
        return remoteNoteGroupLiveDataForId;
    }
}
