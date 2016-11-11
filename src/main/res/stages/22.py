import json
stage='22'
data={}
data['width']=15
data['height']=15
data['name']='Super dove'
data['hints']={}
data['hints']['horizontal']=['2 3 2 2 1','1 2 1 1 1 2','2 1 1 1 3','2 1 3 1','3 1 2','2 2 1 1','1 1 2 2','2 3 5','1 5 1 1','2 1 4 1','1 1 3 1 1','1 1 1 3','1 3 1 1 1','3 1 1 1 2','5 2 2']
data['hints']['vertical']=['2 5 1 1','1 3 1 1 2','3 1 1 2','2 2 4 1','2 1 1 1 1 1','1 1 3 1 3','2 3 1 1','2 1 2','2 3 1 2','1 2 2 1 1','1 3 1 1','1 1 4 4','5 2 1 1 1','2 2 1 2','1 1 1 2']
data['answer']=[]
data['answer'].append([1,1,0,0,0,1,1,1,1,1,0,1,0,1,0])
data['answer'].append([1,0,0,1,1,1,0,1,0,1,0,0,1,1,0])
data['answer'].append([0,0,1,1,1,0,1,0,1,0,0,0,0,1,1])
data['answer'].append([0,1,1,0,1,1,0,0,1,1,1,1,0,0,1])
data['answer'].append([1,1,0,1,0,1,0,0,1,0,0,0,1,0,1])
data['answer'].append([1,0,1,0,0,0,1,1,1,0,1,0,1,1,1])
data['answer'].append([1,1,0,0,0,0,1,1,1,0,0,0,1,0,1])
data['answer'].append([0,0,1,1,0,0,0,1,0,0,1,1,0,0,0])
data['answer'].append([1,1,0,1,1,1,0,0,0,0,1,0,0,1,1])
data['answer'].append([1,0,1,1,0,0,0,0,0,1,1,0,1,0,1])
data['answer'].append([0,1,0,0,0,0,0,1,1,1,0,1,0,1,0])
data['answer'].append([1,0,1,0,1,1,1,1,0,1,1,1,1,0,0])
data['answer'].append([1,1,1,1,1,0,1,1,0,1,0,1,0,0,1])
data['answer'].append([0,1,1,0,0,0,0,1,1,0,1,0,0,1,1])
data['answer'].append([1,0,0,0,0,0,0,1,0,1,0,0,1,1,0])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
