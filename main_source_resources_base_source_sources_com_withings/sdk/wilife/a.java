package com.withings.sdk.wilife;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.withings.sdk.wilife.data.changelog.Changelog;
import com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService;
import com.withings.wiscale2.C1987R;
import fn0.k;
import java.io.FileNotFoundException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: ChangelogDialogOpener.kt */
/* loaded from: classes4.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final Application f43967a;

    /* renamed from: b  reason: collision with root package name */
    private AlertDialog f43968b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f43969c;

    /* compiled from: ChangelogDialogOpener.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.sdk.wilife.ChangelogDialogOpener$onActivityResumed$1$1", f = "ChangelogDialogOpener.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.sdk.wilife.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0601a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f43970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f43971b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0601a(Application application, a aVar, qm0.d<? super C0601a> dVar) {
            super(2, dVar);
            this.f43970a = application;
            this.f43971b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new C0601a(this.f43970a, this.f43971b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((C0601a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            k<Object>[] kVarArr = b.f43972a;
            Application application = this.f43970a;
            u.j(application, "<this>");
            Changelog changelog = null;
            try {
                r40.b bVar = new r40.b(application);
                changelog = (Changelog) BuildersKt.runBlocking(Dispatchers.getIO(), new c(new RemoteChangelogService(), bVar, null));
            } catch (FileNotFoundException e11) {
                Log.e("Wilife-SDK ", "Missing version UUID file", e11);
            }
            if (changelog != null) {
                a.b(this.f43971b, changelog);
            }
            return y.f85009a;
        }
    }

    public a(Application application) {
        u.j(application, "application");
        this.f43967a = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    public static void a(a this$0, r40.b versionIdRetriever) {
        u.j(this$0, "this$0");
        u.j(versionIdRetriever, "$versionIdRetriever");
        String a11 = versionIdRetriever.a();
        AlertDialog alertDialog = this$0.f43968b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.f43968b = null;
        Application application = this$0.f43967a;
        u.j(application, "<this>");
        BuildersKt.runBlocking(Dispatchers.getIO(), new d(application, a11, null));
    }

    public static final void b(a aVar, Changelog changelog) {
        Activity activity = aVar.f43969c;
        if (activity != null) {
            Context baseContext = activity.getBaseContext();
            u.i(baseContext, "getBaseContext(...)");
            r40.b bVar = new r40.b(baseContext);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            Application application = aVar.f43967a;
            AlertDialog create = builder.setTitle(application.getResources().getString(C1987R.string.changelog_title)).setMessage(changelog.getChangelog()).setPositiveButton(application.getResources().getString(C1987R.string.changelog_close), new p40.a(0, aVar, bVar)).setIcon(C1987R.drawable.wilife_icon).setCancelable(false).create();
            aVar.f43968b = create;
            if (create != null) {
                create.show();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        u.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        u.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        u.j(activity, "activity");
        AlertDialog alertDialog = this.f43968b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f43968b = null;
        this.f43969c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        u.j(activity, "activity");
        this.f43969c = activity;
        Application application = this.f43967a;
        u.j(application, "<this>");
        if (((Boolean) BuildersKt.runBlocking(Dispatchers.getIO(), new e(application, null))).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new C0601a(application, this, null), 2, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        u.j(activity, "activity");
        u.j(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        u.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        u.j(activity, "activity");
    }
}
