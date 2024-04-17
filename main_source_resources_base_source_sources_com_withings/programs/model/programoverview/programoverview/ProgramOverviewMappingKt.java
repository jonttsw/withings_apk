package com.withings.programs.model.programoverview.programoverview;

import com.withings.programs.model.programoverview.programoverviewcontent.ProgramOverviewContentMappingKt;
import com.withings.programs.model.webservice.programoverview.ContentTypePreviewDto;
import com.withings.programs.model.webservice.programoverview.WsProgramOverview;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import zl.b;
import zl.c;
/* compiled from: ProgramOverviewMapping.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDto", "Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;", "Lcom/withings/programs/model/webservice/programoverview/WsProgramOverview;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramOverviewMappingKt {
    public static final ProgramOverviewEntity toDto(WsProgramOverview wsProgramOverview) {
        u.j(wsProgramOverview, "<this>");
        String title = wsProgramOverview.getProgram().getData().getTitle();
        String description = wsProgramOverview.getProgram().getData().getDescription();
        String featureImage = wsProgramOverview.getProgram().getData().getFeatureImage();
        ArrayList d11 = c.d(wsProgramOverview.getProgram().getData().getTags());
        List<ContentTypePreviewDto> contentTypePreview = wsProgramOverview.getProgram().getData().getContentTypePreview();
        ArrayList arrayList = new ArrayList(x.y(contentTypePreview, 10));
        for (ContentTypePreviewDto contentTypePreviewDto : contentTypePreview) {
            arrayList.add(ProgramOverviewContentMappingKt.toProgramOverview(contentTypePreviewDto));
        }
        return new ProgramOverviewEntity((String) null, title, description, featureImage, true, (List) d11, (List) arrayList, (List) b.c(wsProgramOverview.getProgram().getData().getRecommendedDevices()), (String) null, 0, 769, (m) null);
    }
}
