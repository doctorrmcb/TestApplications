package com.revature.main;

// Compile time -> Load time -> Run time -> Instantiation time
// Static -> Main ->


public class Scopes {
	// Static gets created during when byte code is loaded into memory (load time).
	static int staticScope = 1;
	
	int instanceScope = 5;
	
	// Gets called before main method.
	static {
		
		staticScope += 5;
		System.out.println(staticScope);
	}
	
	
	//Doesn't run until after main method.
	{instanceScope++; System.out.println(instanceScope);}
	
	public static void main(String[] args) {
		doStatic();
		new Scopes().doStuff(8);
		Scopes s1 = new Scopes();
		Scopes s2 = new Scopes();
		s1.instanceScope = 1;
		s2.instanceScope = 2;
		s1.doStuff(7);
		s2.doStuff(3);
	}
	
	static void doStatic() {
		int staticLocal;
		staticLocal = staticScope;
	}
	
	
	void doStuff(int stuff) {
		
	
		System.out.println(Scopes.staticScope);
		
		System.out.println(instanceScope);
		
		// Doesn't call constructor, so doesn't have default value.
		int methodScope;
		
		methodScope = 7;
		
		for(;;) {
			// Doesn't call constructor, so doesn't have default value.
			// Static and instance scope don't exist within the method scope.
			int local = methodScope;
			local = staticScope;
			local = instanceScope;
			System.out.println(local);
			// Use this to get the instanceScope.
			System.out.println(this.instanceScope);
			if (true) { {int x=5; System.out.println(x);}
				int superLocal = local;
				int instanceScope = 17;
			}
			break;
			// Cannot access superLocal due to it not being in scope outside the if block.
		}
	}
}
