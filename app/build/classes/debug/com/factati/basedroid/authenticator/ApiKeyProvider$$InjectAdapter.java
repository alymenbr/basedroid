// Code generated by dagger-compiler.  Do not edit.
package com.factati.basedroid.authenticator;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<ApiKeyProvider>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code ApiKeyProvider} and its
 * dependencies.
 * 
 * Being a {@code Provider<ApiKeyProvider>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<ApiKeyProvider>} and handling injection
 * of annotated fields.
 */
public final class ApiKeyProvider$$InjectAdapter extends Binding<ApiKeyProvider>
    implements Provider<ApiKeyProvider>, MembersInjector<ApiKeyProvider> {
  private Binding<android.accounts.AccountManager> accountManager;

  public ApiKeyProvider$$InjectAdapter() {
    super("com.factati.basedroid.authenticator.ApiKeyProvider", "members/com.factati.basedroid.authenticator.ApiKeyProvider", NOT_SINGLETON, ApiKeyProvider.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    accountManager = (Binding<android.accounts.AccountManager>) linker.requestBinding("android.accounts.AccountManager", ApiKeyProvider.class);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(accountManager);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<ApiKeyProvider>}.
   */
  @Override
  public ApiKeyProvider get() {
    ApiKeyProvider result = new ApiKeyProvider();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<ApiKeyProvider>}.
   */
  @Override
  public void injectMembers(ApiKeyProvider object) {
    object.accountManager = accountManager.get();
  }
}
