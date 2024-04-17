package com.withings.account.models;

import kotlin.Metadata;
import qm0.d;
/* compiled from: KeyStoreCipher.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withings/account/models/KeyStoreCipher;", "", "", "data", "encrypt", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "decrypt", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface KeyStoreCipher {
    Object decrypt(String str, d<? super String> dVar);

    Object encrypt(String str, d<? super String> dVar);
}
