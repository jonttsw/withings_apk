package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_126_127_Impl.java */
/* loaded from: classes4.dex */
final class z extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    private final n60.a f50675c;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, n60.a] */
    public z() {
        super(126, 127);
        this.f50675c = new Object();
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        androidx.activity.b.d(cVar, "DROP VIEW BookmarkPreviewView", "DROP TABLE `Section`", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.access_level as accessLevel, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
        this.f50675c.getClass();
    }
}
