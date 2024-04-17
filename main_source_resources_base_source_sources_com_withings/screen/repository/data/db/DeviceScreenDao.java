package com.withings.screen.repository.data.db;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.repository.data.model.DeviceScreenEntity;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import qm0.d;
/* compiled from: DeviceScreenDao.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\u000eJ \u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0011\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0011\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/withings/screen/repository/data/db/DeviceScreenDao;", "", "", "Lcom/withings/screen/repository/data/model/DeviceScreenEntity;", "deviceScreens", "Lnm0/y;", "insertOrUpdate", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "deviceId", "Lkotlinx/coroutines/flow/Flow;", "get", "(JJ)Lkotlinx/coroutines/flow/Flow;", "(J)Lkotlinx/coroutines/flow/Flow;", "clearFor", "(JJLqm0/d;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "(JLqm0/d;)Ljava/lang/Object;", "(Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface DeviceScreenDao {
    Object clear(long j5, d<? super y> dVar);

    Object clear(d<? super y> dVar);

    Object clearFor(long j5, long j11, d<? super y> dVar);

    Flow<List<DeviceScreenEntity>> get(long j5);

    Flow<List<DeviceScreenEntity>> get(long j5, long j11);

    Object insertOrUpdate(List<DeviceScreenEntity> list, d<? super y> dVar);
}
