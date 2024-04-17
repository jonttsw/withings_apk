package com.withings.wiscale2.device.common.feature;

import ah.z;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.withings.core.utils.WithingsFileProvider;
import com.withings.core.webcontent.HMWebViewDelegate;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
/* compiled from: FeatureActivationDocument.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final ch.d f51059a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f51060b;

    /* compiled from: FeatureActivationDocument.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/d$a;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface a {
        ch.d d();
    }

    public d(Context context) {
        ch.d intentBuilder = ((a) ah.o.c(context, a.class)).d();
        kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
        this.f51059a = intentBuilder;
        this.f51060b = context;
    }

    public final Bitmap a(InputStream inputStream) {
        File file = new File(this.f51060b.getCacheDir(), "legal");
        file.mkdirs();
        File file2 = new File(file, "feature_activation_doc.pdf");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            f70.a.e(inputStream, fileOutputStream);
            ge0.d.a(fileOutputStream, null);
            PdfRenderer.Page openPage = new PdfRenderer(ParcelFileDescriptor.open(file2, 268435456)).openPage(0);
            Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth(), openPage.getHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.u.i(createBitmap, "createBitmap(...)");
            openPage.render(createBitmap, null, null, 1);
            return createBitmap;
        } finally {
        }
    }

    public final Intent b() {
        Context context = this.f51060b;
        File file = new File(context.getCacheDir(), "legal");
        file.mkdirs();
        File file2 = new File(file, "feature_activation_doc.pdf");
        int i11 = WithingsFileProvider.f35394f;
        Uri a11 = WithingsFileProvider.a.a(context, file2);
        Intent addFlags = ((z) this.f51059a.m()).b(context, a11, false, new HMWebViewDelegate()).addFlags(1);
        kotlin.jvm.internal.u.i(addFlags, "addFlags(...)");
        return addFlags;
    }
}
