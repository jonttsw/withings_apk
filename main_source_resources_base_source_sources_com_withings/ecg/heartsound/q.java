package com.withings.ecg.heartsound;

import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteText;
import java.util.List;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<NoteGroup, String> {

    /* renamed from: a  reason: collision with root package name */
    public static final q f38503a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final String invoke(NoteGroup noteGroup) {
        List<NoteText> texts;
        NoteText noteText;
        NoteGroup noteGroup2 = noteGroup;
        if (noteGroup2 != null && (texts = noteGroup2.getTexts()) != null && (noteText = (NoteText) kotlin.collections.x.K(texts)) != null) {
            return noteText.getText();
        }
        return null;
    }
}
