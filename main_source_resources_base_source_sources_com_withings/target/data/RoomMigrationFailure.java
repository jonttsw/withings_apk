package com.withings.target.data;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/target/data/RoomMigrationFailure;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwable", "", "(Ljava/lang/Throwable;)V", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoomMigrationFailure extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomMigrationFailure(Throwable throwable) {
        super("This exception is reported to inform we cleared user data", throwable);
        u.j(throwable, "throwable");
    }
}
