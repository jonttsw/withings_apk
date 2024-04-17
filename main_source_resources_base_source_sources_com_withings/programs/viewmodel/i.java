package com.withings.programs.viewmodel;

import com.withings.programs.model.program.ProgramDomain;
import com.withings.programs.model.programpreview.ProgramPreviewUi;
import com.withings.programs.model.programpreview.ProgramPreviewUiMappingKt;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AchieveViewModel.kt */
/* loaded from: classes4.dex */
public final class i extends w implements ym0.l<ProgramDomain, ProgramPreviewUi.Discover> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AchieveViewModel f43833a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AchieveViewModel achieveViewModel) {
        super(1);
        this.f43833a = achieveViewModel;
    }

    @Override // ym0.l
    public final ProgramPreviewUi.Discover invoke(ProgramDomain programDomain) {
        ni.a aVar;
        ProgramDomain it = programDomain;
        u.j(it, "it");
        aVar = this.f43833a.f43771b;
        ProgramPreviewUi previewUiItem = ProgramPreviewUiMappingKt.toPreviewUiItem(it, aVar.a());
        if (previewUiItem instanceof ProgramPreviewUi.Discover) {
            return (ProgramPreviewUi.Discover) previewUiItem;
        }
        return null;
    }
}
