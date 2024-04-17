package com.withings.screen.repository.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RoomDeviceScreenContentDao.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.repository.data.RoomDeviceScreenContentDao", f = "RoomDeviceScreenContentDao.kt", l = {21, 23}, m = "insertOrUpdate")
/* loaded from: classes4.dex */
public final class RoomDeviceScreenContentDao$insertOrUpdate$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RoomDeviceScreenContentDao this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDeviceScreenContentDao$insertOrUpdate$1(RoomDeviceScreenContentDao roomDeviceScreenContentDao, d<? super RoomDeviceScreenContentDao$insertOrUpdate$1> dVar) {
        super(dVar);
        this.this$0 = roomDeviceScreenContentDao;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.insertOrUpdate(null, this);
    }
}
