package com.withings.sdk.wilife.data.update.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import s40.a;
/* compiled from: RemoteUpdate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdate;", "Ls40/a;", "convertToUpdate", "(Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdate;)Ls40/a;", "wilife-sdk_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteUpdateKt {
    public static final a convertToUpdate(RemoteUpdate remoteUpdate) {
        u.j(remoteUpdate, "<this>");
        return new a(remoteUpdate.getVersion(), remoteUpdate.getBuild(), remoteUpdate.isRequired());
    }
}
