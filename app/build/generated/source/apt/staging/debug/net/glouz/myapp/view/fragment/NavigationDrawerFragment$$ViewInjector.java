// Generated code from Butter Knife. Do not modify!
package net.glouz.myapp.view.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class NavigationDrawerFragment$$ViewInjector<T extends net.glouz.myapp.view.fragment.NavigationDrawerFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558541, "field 'mListNavigationDrawer'");
    target.mListNavigationDrawer = finder.castView(view, 2131558541, "field 'mListNavigationDrawer'");
  }

  @Override public void reset(T target) {
    target.mListNavigationDrawer = null;
  }
}
