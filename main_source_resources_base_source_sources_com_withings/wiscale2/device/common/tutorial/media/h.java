package com.withings.wiscale2.device.common.tutorial.media;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.common.tutorial.media.MediaTutorialActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class h extends w implements ym0.a<HashMap<Integer, Integer>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MediaTutorialActivity.g f53622a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MediaTutorialActivity.g gVar) {
        super(0);
        this.f53622a = gVar;
    }

    @Override // ym0.a
    public final HashMap<Integer, Integer> invoke() {
        MediaTutorialActivity.g gVar = this.f53622a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(HashMap.class);
        Activity activity = gVar.f53608b;
        if (isAssignableFrom) {
            return (HashMap) b0.F(activity, "EXTRA_NAVIGATION_ACTION_MAP");
        }
        if (Serializable.class.isAssignableFrom(HashMap.class)) {
            return (HashMap) b0.H(activity, "EXTRA_NAVIGATION_ACTION_MAP");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_NAVIGATION_ACTION_MAP of class ", q0.b(HashMap.class), " is not supported"));
    }
}
