package com.withings.target.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.target.Target;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: TargetDAO.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH§@¢\u0006\u0004\b\u0005\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u000bH'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H'¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H'¢\u0006\u0004\b!\u0010\u001cJ/\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H'¢\u0006\u0004\b\"\u0010\u001eJ7\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b#\u0010$J1\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H'¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"Lcom/withings/target/data/TargetDAO;", "Lcom/withings/target/data/TargetDataSource;", "Lcom/withings/target/Target;", "target", "Lnm0/y;", "insert", "(Lcom/withings/target/Target;Lqm0/d;)Ljava/lang/Object;", DiscoverItems.Item.UPDATE_ACTION, "", "targets", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getActiveStepTargetsForAllUser", "()Lkotlinx/coroutines/flow/Flow;", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "dateTime", "getAllTargetForUserSince", "(JLorg/joda/time/DateTime;)Ljava/util/List;", "getAllActivatedTargetsForUserFlow", "(J)Lkotlinx/coroutines/flow/Flow;", "mostRecentModified", "(J)Lorg/joda/time/DateTime;", "", "targetType", "measureType", "getLastActiveTargetForUser", "(JII)Lcom/withings/target/Target;", "getLastActiveTargetForUserFlow", "(JII)Lkotlinx/coroutines/flow/Flow;", "getLastActiveTargetByTypeForUserFlow", "(JI)Lkotlinx/coroutines/flow/Flow;", "getLastTargetForUser", "getLastTargetForUserFlow", "getTargetAtTimeFlow", "(JIILorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "getTargetAtTime", "(JIILorg/joda/time/DateTime;)Lcom/withings/target/Target;", "getTargetToSync", "(J)Ljava/util/List;", CervicalMucusRecord.Appearance.CLEAR, "()V", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface TargetDAO extends TargetDataSource {
    @Override // com.withings.target.data.TargetDataSource
    void clear();

    @Override // com.withings.target.data.TargetDataSource
    Flow<List<Target>> getActiveStepTargetsForAllUser();

    @Override // com.withings.target.data.TargetDataSource
    Flow<List<Target>> getAllActivatedTargetsForUserFlow(long j5);

    @Override // com.withings.target.data.TargetDataSource
    List<Target> getAllTargetForUserSince(long j5, DateTime dateTime);

    @Override // com.withings.target.data.TargetDataSource
    Flow<Target> getLastActiveTargetByTypeForUserFlow(long j5, int i11);

    @Override // com.withings.target.data.TargetDataSource
    Target getLastActiveTargetForUser(long j5, int i11, int i12);

    @Override // com.withings.target.data.TargetDataSource
    Flow<Target> getLastActiveTargetForUserFlow(long j5, int i11, int i12);

    @Override // com.withings.target.data.TargetDataSource
    Target getLastTargetForUser(long j5, int i11, int i12);

    @Override // com.withings.target.data.TargetDataSource
    Flow<Target> getLastTargetForUserFlow(long j5, int i11, int i12);

    @Override // com.withings.target.data.TargetDataSource
    Target getTargetAtTime(long j5, int i11, int i12, DateTime dateTime);

    @Override // com.withings.target.data.TargetDataSource
    Flow<Target> getTargetAtTimeFlow(long j5, int i11, int i12, DateTime dateTime);

    @Override // com.withings.target.data.TargetDataSource
    List<Target> getTargetToSync(long j5);

    @Override // com.withings.target.data.TargetDataSource
    Object insert(Target target, d<? super y> dVar);

    @Override // com.withings.target.data.TargetDataSource
    Object insert(List<Target> list, d<? super y> dVar);

    @Override // com.withings.target.data.TargetDataSource
    DateTime mostRecentModified(long j5);

    @Override // com.withings.target.data.TargetDataSource
    Object update(Target target, d<? super y> dVar);
}
