package com.withings.screen.ktx;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceScreensRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.ktx.DeviceScreensRepositoryKt", f = "DeviceScreensRepository.kt", l = {9}, m = "getOnce")
/* loaded from: classes4.dex */
public final class DeviceScreensRepositoryKt$getOnce$1 extends c {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceScreensRepositoryKt$getOnce$1(d<? super DeviceScreensRepositoryKt$getOnce$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DeviceScreensRepositoryKt.getOnce(null, 0L, null, this);
    }
}
