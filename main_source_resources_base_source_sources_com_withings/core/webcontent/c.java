package com.withings.core.webcontent;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: HMWebViewDelegate.kt */
/* loaded from: classes3.dex */
final class c extends w implements l<Intent, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HMWebViewDelegate f35402a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f35403b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FragmentActivity fragmentActivity, HMWebViewDelegate hMWebViewDelegate) {
        super(1);
        this.f35402a = hMWebViewDelegate;
        this.f35403b = fragmentActivity;
    }

    @Override // ym0.l
    public final y invoke(Intent intent) {
        Intent intent2 = intent;
        this.f35402a.getClass();
        if (intent2 != null) {
            Activity activity = this.f35403b;
            if (wq.b.a(activity, intent2)) {
                intent2.setFlags(67141632);
                activity.startActivity(intent2);
            }
        }
        return y.f85009a;
    }
}
