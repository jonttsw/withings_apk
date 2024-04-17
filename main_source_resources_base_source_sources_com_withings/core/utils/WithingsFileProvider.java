package com.withings.core.utils;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import dp0.j;
import f7.e;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WithingsFileProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/core/utils/WithingsFileProvider;", "Landroidx/core/content/FileProvider;", "<init>", "()V", "a", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WithingsFileProvider extends FileProvider {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f35394f = 0;

    /* compiled from: WithingsFileProvider.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Uri a(Context context, File file) {
            u.j(context, "context");
            u.j(file, "file");
            String str = e.f66266a;
            if (str != null) {
                Uri c11 = FileProvider.c(context, file, str);
                u.i(c11, "getUriForFile(...)");
                return c11;
            }
            u.s("imageProviderAuthority");
            throw null;
        }
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final String getType(Uri uri) {
        u.j(uri, "uri");
        String path = uri.getPath();
        if (path != null && j.r(path, "external_cache", false) && j.u(path, ".0", false)) {
            return "image/*";
        }
        return super.getType(uri);
    }
}
