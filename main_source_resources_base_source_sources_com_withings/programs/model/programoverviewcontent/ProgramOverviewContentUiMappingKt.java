package com.withings.programs.model.programoverviewcontent;

import com.withings.programs.model.programoverview.programoverviewcontent.ProgramOverviewContentEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import s10.a;
/* compiled from: ProgramOverviewContentUiMapping.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/programs/model/programoverview/programoverviewcontent/ProgramOverviewContentEntity;", "Ls10/a;", "toUiItem", "(Lcom/withings/programs/model/programoverview/programoverviewcontent/ProgramOverviewContentEntity;)Ls10/a;", "ui_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProgramOverviewContentUiMappingKt {
    public static final a toUiItem(ProgramOverviewContentEntity programOverviewContentEntity) {
        u.j(programOverviewContentEntity, "<this>");
        return new a(programOverviewContentEntity.getFeatureImage(), programOverviewContentEntity.getTitle(), programOverviewContentEntity.getSubtitle());
    }
}
