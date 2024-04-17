package com.withings.programs.model.programoverview.programoverviewcontent;

import com.withings.programs.model.webservice.programoverview.ContentTypePreviewDto;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ProgramOverviewContentMapping.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProgramOverview", "Lcom/withings/programs/model/programoverview/programoverviewcontent/ProgramOverviewContentEntity;", "Lcom/withings/programs/model/webservice/programoverview/ContentTypePreviewDto;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramOverviewContentMappingKt {
    public static final ProgramOverviewContentEntity toProgramOverview(ContentTypePreviewDto contentTypePreviewDto) {
        u.j(contentTypePreviewDto, "<this>");
        return new ProgramOverviewContentEntity(contentTypePreviewDto.getFeatureImage(), contentTypePreviewDto.getTitle(), contentTypePreviewDto.getSubtitle());
    }
}
