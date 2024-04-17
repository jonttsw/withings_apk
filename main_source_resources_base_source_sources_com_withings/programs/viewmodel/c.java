package com.withings.programs.viewmodel;

import com.withings.programs.model.programpreview.ProgramPreviewUi;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: AchieveViewModel.kt */
/* loaded from: classes4.dex */
final class c extends w implements ym0.l<ProgramPreviewUi.Discover, Comparable<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f43827a = new w(1);

    @Override // ym0.l
    public final Comparable<?> invoke(ProgramPreviewUi.Discover discover) {
        ProgramPreviewUi.Discover it = discover;
        u.j(it, "it");
        return Boolean.valueOf(it.getLabelText().isEmpty());
    }
}
