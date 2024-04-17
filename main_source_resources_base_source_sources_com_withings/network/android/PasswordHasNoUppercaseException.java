package com.withings.network.android;

import com.withings.webservices.legacy.common.exception.WrongStatusException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/network/android/PasswordHasNoUppercaseException;", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Checked;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PasswordHasNoUppercaseException extends WrongStatusException.Checked {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordHasNoUppercaseException(String url, WrongStatusException.Conversion conversion) {
        super(url, conversion);
        u.j(url, "url");
        u.j(conversion, "conversion");
    }
}
