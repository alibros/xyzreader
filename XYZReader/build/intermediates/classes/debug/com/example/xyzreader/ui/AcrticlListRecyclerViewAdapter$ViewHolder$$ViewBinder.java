// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AcrticlListRecyclerViewAdapter$ViewHolder$$ViewBinder<T extends com.example.xyzreader.ui.AcrticlListRecyclerViewAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361908, "field 'imageView'");
    target.imageView = finder.castView(view, 2131361908, "field 'imageView'");
    view = finder.findRequiredView(source, 2131361909, "field 'titleView'");
    target.titleView = finder.castView(view, 2131361909, "field 'titleView'");
    view = finder.findRequiredView(source, 2131361910, "field 'subtitleView'");
    target.subtitleView = finder.castView(view, 2131361910, "field 'subtitleView'");
  }

  @Override public void unbind(T target) {
    target.imageView = null;
    target.titleView = null;
    target.subtitleView = null;
  }
}
