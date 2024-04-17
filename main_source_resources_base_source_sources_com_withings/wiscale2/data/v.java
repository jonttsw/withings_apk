package com.withings.wiscale2.data;
/* compiled from: RoomDb_AutoMigration_107_108_Impl.java */
/* loaded from: classes4.dex */
final class v extends w8.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f50672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i11) {
        super(107, 108);
        this.f50672c = i11;
        if (i11 != 1) {
        } else {
            super(83, 84);
        }
    }

    @Override // w8.b
    public final void a(a9.c cVar) {
        switch (this.f50672c) {
            case 0:
                cVar.l("DROP VIEW BookmarkPreviewView");
                cVar.l("CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
                return;
            default:
                return;
        }
    }
}
