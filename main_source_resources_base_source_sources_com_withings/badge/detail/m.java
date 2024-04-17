package com.withings.badge.detail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.withings.core.utils.WithingsFileProvider;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: BadgeDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.badge.detail.BadgeDetailViewModel$saveImageAndGetUri$2", f = "BadgeDetailViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super Uri>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Drawable f32784a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f32785b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, Drawable drawable, qm0.d dVar) {
        super(2, dVar);
        this.f32784a = drawable;
        this.f32785b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f32785b, this.f32784a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Uri> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Bitmap a11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        a11 = androidx.core.graphics.drawable.b.a(r9, r9.getIntrinsicWidth(), this.f32784a.getIntrinsicHeight(), null);
        Context context = this.f32785b;
        File file = new File(context.getCacheDir(), "badges");
        if (!file.mkdirs() && (!file.exists() || !file.isDirectory())) {
            return null;
        }
        File file2 = new File(file, ah.a.c("badge-", DateTime.now().getMillis(), ".jpeg"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            a11.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            ge0.d.a(fileOutputStream, null);
            int i11 = WithingsFileProvider.f35394f;
            return WithingsFileProvider.a.a(context, file2);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ge0.d.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }
}
