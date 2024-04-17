package com.withings.screen.repository.data.db;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.screen.repository.data.model.DeviceScreensGroupEntity;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import qm0.d;
/* compiled from: DeviceScreensGroupDao.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\r\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/withings/screen/repository/data/db/DeviceScreensGroupDao;", "", "", "Lcom/withings/screen/repository/data/model/DeviceScreensGroupEntity;", "groups", "Lnm0/y;", "insertOrUpdate", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "", "deviceId", "Lkotlinx/coroutines/flow/Flow;", "get", "(J)Lkotlinx/coroutines/flow/Flow;", CervicalMucusRecord.Appearance.CLEAR, "(JLqm0/d;)Ljava/lang/Object;", "(Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface DeviceScreensGroupDao {
    Object clear(long j5, d<? super y> dVar);

    Object clear(d<? super y> dVar);

    Flow<List<DeviceScreensGroupEntity>> get(long j5);

    Object insertOrUpdate(List<DeviceScreensGroupEntity> list, d<? super y> dVar);
}
