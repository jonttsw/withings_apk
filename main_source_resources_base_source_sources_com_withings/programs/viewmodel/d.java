package com.withings.programs.viewmodel;

import com.withings.programs.model.programpreview.ProgramPreviewUi;
import java.util.Locale;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: AchieveViewModel.kt */
/* loaded from: classes4.dex */
final class d extends w implements ym0.l<ProgramPreviewUi.Discover, Comparable<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f43828a = new w(1);

    @Override // ym0.l
    public final Comparable<?> invoke(ProgramPreviewUi.Discover discover) {
        ProgramPreviewUi.Discover it = discover;
        u.j(it, "it");
        String section = it.getSection();
        if (section != null) {
            String lowerCase = section.toLowerCase(Locale.ROOT);
            u.i(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        return null;
    }
}
