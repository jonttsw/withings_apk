package com.withings.programs.model.room.wifittask;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.room.metadata.MetadataEntity;
import com.withings.programs.model.room.metadata.MetadataMapperKt;
import com.withings.programs.model.webservice.wellnesstasks.WsDates;
import com.withings.programs.model.webservice.wellnesstasks.WsMetadata;
import com.withings.programs.model.webservice.wellnesstasks.WsPreviewTask;
import com.withings.programs.model.webservice.wellnesstasks.WsProgressionTask;
import com.withings.programs.model.webservice.wellnesstasks.WsTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import zl.c;
/* compiled from: WifitDataTaskMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001¨\u0006\n"}, d2 = {"toEntity", "", "Lcom/withings/programs/model/room/wifittask/ProgramTaskPreviewEntity;", "Lcom/withings/programs/model/webservice/wellnesstasks/WsTask;", NavigationArguments.PROGRAM_ID, "", NavigationArguments.INSTANCE_ID, "", "completionDateInSeconds", "Lcom/withings/programs/model/webservice/wellnesstasks/WsProgressionTask;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WifitDataTaskMapperKt {
    public static final List<ProgramTaskPreviewEntity> toEntity(WsTask wsTask, long j5, int i11, List<WsProgressionTask> completionDateInSeconds) {
        Long l5;
        Object obj;
        MetadataEntity metadataEntity;
        Integer num;
        u.j(wsTask, "<this>");
        u.j(completionDateInSeconds, "completionDateInSeconds");
        List<WsDates> dates = wsTask.getDates();
        ArrayList arrayList = new ArrayList(x.y(dates, 10));
        for (WsDates wsDates : dates) {
            List<WsPreviewTask> listPreviewTasks = wsDates.getListPreviewTasks();
            ArrayList arrayList2 = new ArrayList(x.y(listPreviewTasks, 10));
            for (WsPreviewTask wsPreviewTask : listPreviewTasks) {
                Iterator<T> it = completionDateInSeconds.iterator();
                while (true) {
                    l5 = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (u.e(((WsProgressionTask) obj).getTaskIdentifier(), wsPreviewTask.getTaskIdentifier())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                WsProgressionTask wsProgressionTask = (WsProgressionTask) obj;
                String taskIdentifier = wsPreviewTask.getTaskIdentifier();
                String identifier = wsPreviewTask.getIdentifier();
                String type = wsPreviewTask.getType();
                String title = wsPreviewTask.getTitle();
                String thumbnail = wsPreviewTask.getThumbnail();
                boolean required = wsPreviewTask.getRequired();
                ArrayList d11 = c.d(wsPreviewTask.getListInfoTags());
                WsMetadata metadata = wsPreviewTask.getMetadata();
                if (metadata != null) {
                    metadataEntity = MetadataMapperKt.toEntity(metadata);
                } else {
                    metadataEntity = null;
                }
                int weekIndex = wsTask.getWeekIndex();
                String weekLabel = wsTask.getWeekLabel();
                int dayIndex = wsDates.getDayIndex();
                String dayLabel = wsDates.getDayLabel();
                int taskIndex = wsPreviewTask.getTaskIndex();
                Double goal = wsPreviewTask.getGoal();
                Integer measureType = wsPreviewTask.getMeasureType();
                if (wsProgressionTask != null) {
                    num = Integer.valueOf(wsProgressionTask.getStatus());
                } else {
                    num = null;
                }
                if (wsProgressionTask != null) {
                    l5 = Long.valueOf(wsProgressionTask.getCompletionDateInMillis());
                }
                arrayList2.add(new ProgramTaskPreviewEntity(taskIdentifier, identifier, type, title, thumbnail, Boolean.valueOf(required), d11, Integer.valueOf(weekIndex), weekLabel, Integer.valueOf(dayIndex), dayLabel, Integer.valueOf(taskIndex), j5, i11, true, null, goal, measureType, num, l5, metadataEntity, false, 2129920, null));
            }
            arrayList.add(arrayList2);
        }
        return x.L(arrayList);
    }
}
