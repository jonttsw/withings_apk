package com.withings.screen.ktx;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.model.DeviceScreensGroup;
import com.withings.screen.repository.DeviceScreensRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import qm0.d;
/* compiled from: DeviceScreensRepository.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/screen/repository/DeviceScreensRepository;", "", "deviceId", NavigationArguments.USER_ID, "", "Lcom/withings/screen/model/DeviceScreensGroup;", "getOnce", "(Lcom/withings/screen/repository/DeviceScreensRepository;JLjava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "getOnceBlocking", "(Lcom/withings/screen/repository/DeviceScreensRepository;JLjava/lang/Long;)Ljava/util/List;", "core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeviceScreensRepositoryKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getOnce(com.withings.screen.repository.DeviceScreensRepository r4, long r5, java.lang.Long r7, qm0.d<? super java.util.List<com.withings.screen.model.DeviceScreensGroup>> r8) {
        /*
            boolean r0 = r8 instanceof com.withings.screen.ktx.DeviceScreensRepositoryKt$getOnce$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.screen.ktx.DeviceScreensRepositoryKt$getOnce$1 r0 = (com.withings.screen.ktx.DeviceScreensRepositoryKt$getOnce$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.screen.ktx.DeviceScreensRepositoryKt$getOnce$1 r0 = new com.withings.screen.ktx.DeviceScreensRepositoryKt$getOnce$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            nm0.l.b(r8)
            kotlinx.coroutines.flow.Flow r4 = r4.get(r5, r7)
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r4, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L45
            kotlin.collections.i0 r8 = kotlin.collections.i0.f76187a
        L45:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.screen.ktx.DeviceScreensRepositoryKt.getOnce(com.withings.screen.repository.DeviceScreensRepository, long, java.lang.Long, qm0.d):java.lang.Object");
    }

    public static /* synthetic */ Object getOnce$default(DeviceScreensRepository deviceScreensRepository, long j5, Long l5, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l5 = null;
        }
        return getOnce(deviceScreensRepository, j5, l5, dVar);
    }

    public static final List<DeviceScreensGroup> getOnceBlocking(DeviceScreensRepository deviceScreensRepository, long j5, Long l5) {
        Object runBlocking$default;
        u.j(deviceScreensRepository, "<this>");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new DeviceScreensRepositoryKt$getOnceBlocking$1(deviceScreensRepository, j5, l5, null), 1, null);
        return (List) runBlocking$default;
    }

    public static /* synthetic */ List getOnceBlocking$default(DeviceScreensRepository deviceScreensRepository, long j5, Long l5, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l5 = null;
        }
        return getOnceBlocking(deviceScreensRepository, j5, l5);
    }
}
