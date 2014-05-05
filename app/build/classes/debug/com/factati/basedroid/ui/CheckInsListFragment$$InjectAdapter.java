// Code generated by dagger-compiler.  Do not edit.
package com.factati.basedroid.ui;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<CheckInsListFragment>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code CheckInsListFragment} and its
 * dependencies.
 * 
 * Being a {@code Provider<CheckInsListFragment>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<CheckInsListFragment>} and handling injection
 * of annotated fields.
 */
public final class CheckInsListFragment$$InjectAdapter extends Binding<CheckInsListFragment>
    implements Provider<CheckInsListFragment>, MembersInjector<CheckInsListFragment> {
  private Binding<com.factati.basedroid.BootstrapServiceProvider> serviceProvider;
  private Binding<com.factati.basedroid.authenticator.LogoutService> logoutService;
  private Binding<ItemListFragment> supertype;

  public CheckInsListFragment$$InjectAdapter() {
    super("com.factati.basedroid.ui.CheckInsListFragment", "members/com.factati.basedroid.ui.CheckInsListFragment", NOT_SINGLETON, CheckInsListFragment.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    serviceProvider = (Binding<com.factati.basedroid.BootstrapServiceProvider>) linker.requestBinding("com.factati.basedroid.BootstrapServiceProvider", CheckInsListFragment.class);
    logoutService = (Binding<com.factati.basedroid.authenticator.LogoutService>) linker.requestBinding("com.factati.basedroid.authenticator.LogoutService", CheckInsListFragment.class);
    supertype = (Binding<ItemListFragment>) linker.requestBinding("members/com.factati.basedroid.ui.ItemListFragment", CheckInsListFragment.class, false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(serviceProvider);
    injectMembersBindings.add(logoutService);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<CheckInsListFragment>}.
   */
  @Override
  public CheckInsListFragment get() {
    CheckInsListFragment result = new CheckInsListFragment();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<CheckInsListFragment>}.
   */
  @Override
  public void injectMembers(CheckInsListFragment object) {
    object.serviceProvider = serviceProvider.get();
    object.logoutService = logoutService.get();
    supertype.injectMembers(object);
  }
}