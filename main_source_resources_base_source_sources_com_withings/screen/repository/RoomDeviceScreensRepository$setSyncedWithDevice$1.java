package com.withings.screen.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RoomDeviceScreensRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.repository.RoomDeviceScreensRepository", f = "RoomDeviceScreensRepository.kt", l = {51, 52, 54, 55}, m = "setSyncedWithDevice")
/* loaded from: classes4.dex */
public final class RoomDeviceScreensRepository$setSyncedWithDevice$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RoomDeviceScreensRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDeviceScreensRepository$setSyncedWithDevice$1(RoomDeviceScreensRepository roomDeviceScreensRepository, d<? super RoomDeviceScreensRepository$setSyncedWithDevice$1> dVar) {
        super(dVar);
        this.this$0 = roomDeviceScreensRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setSyncedWithDevice(0L, this);
    }
}
