package com.withings.leaderboard.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.core.view.l1;
import bn0.d;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import ym0.a;
/* compiled from: MyFriendCodeActivity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/withings/leaderboard/ui/MyFriendCodeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onCreate", "(Landroid/os/Bundle;)V", "", "userName$delegate", "Lbn0/d;", "getUserName", "()Ljava/lang/String;", "userName", "userHash$delegate", "getUserHash", "userHash", "<init>", "()V", "Companion", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MyFriendCodeActivity extends WithingsActivity {
    private static final String EXTRA_USER_HASH = "user_hash";
    private static final String EXTRA_USER_NAME = "user_name";
    private static final int QRCODE_SIZE = 1000;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(MyFriendCodeActivity.class, "userName", "getUserName()Ljava/lang/String;", 0), v.c(MyFriendCodeActivity.class, "userHash", "getUserHash()Ljava/lang/String;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final d userName$delegate = new d<Activity, String>() { // from class: com.withings.leaderboard.ui.MyFriendCodeActivity$special$$inlined$extra$1
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Activity.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.leaderboard.ui.MyFriendCodeActivity$special$$inlined$extra$1$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends w implements a<String> {
            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
            @Override // ym0.a
            public final String invoke() {
                return getExtra();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getExtra() {
            return b0.I(this, r2);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.String] */
        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public String getValue2(Activity thisRef, k<?> property) {
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return getValue();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public /* bridge */ /* synthetic */ String getValue(Activity activity, k kVar) {
            return getValue2(activity, (k<?>) kVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
        public final String getValue() {
            return this.value$delegate.getValue();
        }
    };
    private final d userHash$delegate = new d<Activity, String>() { // from class: com.withings.leaderboard.ui.MyFriendCodeActivity$special$$inlined$extra$2
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Activity.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.leaderboard.ui.MyFriendCodeActivity$special$$inlined$extra$2$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends w implements a<String> {
            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
            @Override // ym0.a
            public final String invoke() {
                return getExtra();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getExtra() {
            return b0.I(this, r2);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.String] */
        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public String getValue2(Activity thisRef, k<?> property) {
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return getValue();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public /* bridge */ /* synthetic */ String getValue(Activity activity, k kVar) {
            return getValue2(activity, (k<?>) kVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
        public final String getValue() {
            return this.value$delegate.getValue();
        }
    };

    /* compiled from: MyFriendCodeActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/withings/leaderboard/ui/MyFriendCodeActivity$Companion;", "", "()V", "EXTRA_USER_HASH", "", "EXTRA_USER_NAME", "QRCODE_SIZE", "", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "userName", "userHash", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, String userName, String userHash) {
            u.j(context, "context");
            u.j(userName, "userName");
            u.j(userHash, "userHash");
            Intent putExtra = new Intent(context, MyFriendCodeActivity.class).putExtra(MyFriendCodeActivity.EXTRA_USER_NAME, userName).putExtra(MyFriendCodeActivity.EXTRA_USER_HASH, userHash);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserHash() {
        return (String) this.userHash$delegate.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserName() {
        return (String) this.userName$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -1879812019, new MyFriendCodeActivity$onCreate$1(this)));
    }
}
