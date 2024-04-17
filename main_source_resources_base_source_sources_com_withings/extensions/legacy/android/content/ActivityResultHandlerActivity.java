package com.withings.extensions.legacy.android.content;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
/* compiled from: ActivityResultHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/extensions/legacy/android/content/ActivityResultHandlerActivity;", "Landroid/app/Activity;", "<init>", "()V", "extensions-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ActivityResultHandlerActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f39089c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final g f39090a = h.b(new a());

    /* renamed from: b  reason: collision with root package name */
    private final g f39091b = h.b(new b());

    /* compiled from: ActivityResultHandler.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<Intent> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Intent invoke() {
            Intent intent = (Intent) ActivityResultHandlerActivity.this.getIntent().getParcelableExtra("ARG_EXTRA_INTENT");
            if (intent != null) {
                return intent;
            }
            throw new IllegalArgumentException();
        }
    }

    /* compiled from: ActivityResultHandler.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<ResultReceiver> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ResultReceiver invoke() {
            ResultReceiver resultReceiver = (ResultReceiver) ActivityResultHandlerActivity.this.getIntent().getParcelableExtra("ARG_EXTRA_RESULT_RECEIVER");
            if (resultReceiver != null) {
                return resultReceiver;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i11, int i12, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i11, i12, intent);
        ResultReceiver resultReceiver = (ResultReceiver) this.f39091b.getValue();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        resultReceiver.send(i12, bundle);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivityForResult((Intent) this.f39090a.getValue(), 1993);
    }
}
