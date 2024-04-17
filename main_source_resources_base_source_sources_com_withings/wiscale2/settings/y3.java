package com.withings.wiscale2.settings;

import android.os.Bundle;
import com.withings.notifications.preferences.core.model.NotificationPreferenceType;
import i6.a;
import java.util.Iterator;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class y3 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f60391a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60392b;

    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<NotificationPreferenceType> f60393a = sm0.b.a(NotificationPreferenceType.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(r8.n nVar, SettingsActivity settingsActivity) {
        super(4);
        this.f60391a = nVar;
        this.f60392b = settingsActivity;
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [ym0.a, kotlin.jvm.internal.a] */
    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        String str;
        i6.a aVar2;
        l0.c composable = cVar;
        androidx.navigation.d backStackEntry = dVar;
        androidx.compose.runtime.a aVar3 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(backStackEntry, "backStackEntry");
        Bundle c11 = backStackEntry.c();
        Object obj = null;
        if (c11 != null) {
            str = c11.getString("notificationType");
        } else {
            str = null;
        }
        Iterator it = ((kotlin.collections.c) a.f60393a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.u.e(((NotificationPreferenceType) next).name(), str)) {
                obj = next;
                break;
            }
        }
        NotificationPreferenceType notificationPreferenceType = (NotificationPreferenceType) obj;
        if (notificationPreferenceType != null) {
            w3 w3Var = new w3(this.f60392b, notificationPreferenceType);
            aVar3.s(419377738);
            androidx.lifecycle.n1 a11 = j6.a.a(aVar3);
            if (a11 != null) {
                i6.c cVar2 = new i6.c();
                cVar2.a(kotlin.jvm.internal.q0.b(i10.m.class), w3Var);
                i6.b b10 = cVar2.b();
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                androidx.lifecycle.g1 a12 = j6.b.a(i10.m.class, a11, null, b10, aVar2, aVar3);
                aVar3.J();
                i10.b.b((i10.m) a12, new kotlin.jvm.internal.a(0, this.f60391a, r8.n.class, "popBackStack", "popBackStack()Z", 8), aVar3, 8);
                return nm0.y.f85009a;
            }
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        throw new IllegalArgumentException("Notifications preferences screen requires a notification type (push or mail...)".toString());
    }
}
